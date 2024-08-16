package tallerpruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
    private Employee WorkerUSD;
    private Employee WorkerNonUSD;
    private Employee supervisorUSD;
    private Employee supervisorNonUSD;
    private Employee managerUSD;
    private Employee managerNonUSD;
    
    
    @BeforeEach
    public void setUp() {
    	WorkerUSD = new Employee(1000, "USD", 0, EmployeeType.Worker);
        WorkerNonUSD = new Employee(1000, "NSD", 0, EmployeeType.Worker);
        supervisorUSD = new Employee(2000, "USD", 10, EmployeeType.Supervisor);
        supervisorNonUSD = new Employee(2000, "NSD", 10, EmployeeType.Supervisor);
        managerUSD = new Employee(3000, "USD", 20, EmployeeType.Manager);
        managerNonUSD = new Employee(3000, "NSD", 20, EmployeeType.Manager);

    }
	    @Test
	    public void testWorkerUSDMesPar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000;
	            assertEquals(expectedSalary, WorkerUSD.cs(), 0.01);
	        }
	    }
	    
	    @Test
	    public void testWorkerUSDMesImpar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 != 0) {
	            float expectedSalary = 1000 + (386.0f / 12 * 2);
	            assertEquals(expectedSalary, WorkerUSD.cs(), 0.01);
	        }
	    }
	    
	    
	    @Test
	    public void testEmployeeNonUSDMesPar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000 * 0.95f;
	            assertEquals(expectedSalary, WorkerNonUSD.cs(), 0.01);
	        }
	    }
	    
	    @Test
	    public void testEmployeeNonUSDMesImpar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000 * 0.95f;
	            assertEquals(expectedSalary, WorkerNonUSD.cs(), 0.01);
	        }
	    }
	    
	    //////
	    @Test
	    public void testSupervisorUSDMesPar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000;
	            assertEquals(expectedSalary, supervisorUSD.cs(), 0.01);
	        }
	    }
	    
	    @Test
	    public void testSupervisorUSDMesImpar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 != 0) {
	            float expectedSalary = 1000 + (386.0f / 12 * 2);
	            assertEquals(expectedSalary, supervisorUSD.cs(), 0.01);
	        }
	    }
	    
	    
	    @Test
	    public void testSupervisorNonUSDMesPar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000 * 0.95f;
	            assertEquals(expectedSalary, supervisorNonUSD.cs(), 0.01);
	        }
	    }
	    
	    @Test
	    public void testSupervisorNonUSDMesImpar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000 * 0.95f;
	            assertEquals(expectedSalary, supervisorNonUSD.cs(), 0.01);
	        }
	    }
	    
	    
	    
	    @Test
	    public void testManagerUSDMesPar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000;
	            assertEquals(expectedSalary, managerUSD.cs(), 0.01);
	        }
	    }
	    
	    @Test
	    public void testManagerUSDMesImpar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 != 0) {
	            float expectedSalary = 1000 + (386.0f / 12 * 2);
	            assertEquals(expectedSalary, managerUSD.cs(), 0.01);
	        }
	    }
	    
	    
	    @Test
	    public void testManagerNonUSDMesPar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000 * 0.95f;
	            assertEquals(expectedSalary, managerNonUSD.cs(), 0.01);
	        }
	    }
	    
	    @Test
	    public void testManagerNonUSDMesImpar() {
	        LocalDate currentDate = LocalDate.now();
	        if (currentDate.getMonthValue() % 2 == 0) {
	            float expectedSalary = 1000 * 0.95f;
	            assertEquals(expectedSalary, managerNonUSD.cs(), 0.01);
	        }
	    }
	    
	    @Test
		void employeeUSDTestCalculateYearBonus() {
			assertEquals(386,WorkerUSD.CalculateYearBonus());
			assertEquals(2193,supervisorUSD.CalculateYearBonus());
			assertEquals(3386,managerUSD.CalculateYearBonus());
		}
		
		@Test
		void employeeNonUSDTestCalculateYearBonus() {
			assertEquals(386,WorkerNonUSD.CalculateYearBonus());
			assertEquals(2093,supervisorNonUSD.CalculateYearBonus());
			assertEquals(3236,managerNonUSD.CalculateYearBonus());
		}
	    
	    
}
    
    
    
    
    