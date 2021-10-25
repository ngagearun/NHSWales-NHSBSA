package com.NHS.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Utils.TestBase;

//Given below is NHSHomepage file implementing various functionalities of Step Definitions and it also extends Test Base Class which is used to intialize webdrivers 
public class NHSHompage extends TestBase {

	String NHSMsg, NHSPrs, NHSDcheck, NHSFreeSightTest, NHSFreeFrabricWig, NHSMoneyOffNewGlasseslenses,
			NHSMoneyOffRepairGlasseslenses, NHSPaidTravel, NHSPresTick, SightTestTick, DentalExamTick, DentalTreatment;

	SoftAssert softassert = new SoftAssert();

	// In this class various elements from Wales User Journey are declared

	@FindBy(id = "next-button")
	public static WebElement NHSHomePgNextButton;

	// Declaring elements of Country Selection Page
	@FindBy(id = "label-england")
	public static WebElement CountryEngland;

	@FindBy(id = "label-scotland")
	public static WebElement CountryScotland;

	@FindBy(id = "label-wales")
	public static WebElement Countrywales;

	@FindBy(id = "label-nire")
	public static WebElement CountryNorthernireland;

	// Declaring elements of DOB page
	@FindBy(id = "dob-day")
	public static WebElement NHSPatientday;

	@FindBy(id = "dob-month")
	public static WebElement NHSPatientmonth;

	@FindBy(id = "dob-year")
	public static WebElement NHSPatientyear;

	// Declaring elements in Results Page when the patient is below 16 years
	@FindBy(xpath = "//*[@id='content']/div[2]/div/div[2]/h2")
	public static WebElement NHSFreecost;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/ul[1]/li[1]")
	public static WebElement NHSPrescription;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/ul[1]/li[2]")
	public static WebElement NHSDentalChecksTreatments;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/ul[1]/li[3]")
	public static WebElement NHSSightests;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/ul[1]/li[4]")
	public static WebElement NHSFabricWigs;
	
	@FindBy(xpath = "//*[@id='content']/div[3]/div/ul[1]/li[1]")
	public static WebElement NHSPrescriptionforclaim;

	@FindBy(xpath = "//*[@id='content']/div[3]/div/ul[1]/li[2]")
	public static WebElement NHSDentalChecksTreatmentsforclaim;

	@FindBy(xpath = "//*[@id='content']/div[3]/div/ul[1]/li[3]")
	public static WebElement NHSSightestsforclaim;

	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/ul[1]/li[4]")
	public static WebElement NHSFabricWigsforclaim;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/ul[2]/li[1]")
	public static WebElement NewGlassesContactlenses;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/ul[2]/li[2]")
	public static WebElement RepairReplaceGlassesContactlenses;

	@FindBy(xpath = "//*[@id=content]/div[2]/div/ul[3]/li")
	public static WebElement travelNHStreatment;
	
	@FindBy(xpath = "//*[@id='content']/div[3]/div/ul[2]/li[1]")
	public static WebElement NewGlassesContactlensesforclaim;

	@FindBy(xpath = "//*[@id='content']/div[3]/div/ul[2]/li[2]")
	public static WebElement RepairReplaceGlassesContactlensesforclaim;

	@FindBy(xpath = "//*[@id='content']/div[3]/div/ul[2]/li[3]")
	public static WebElement travelNHStreatmentforclaim;

	@FindBy(id = "label-no")
	public static WebElement NoRadiobutton;

	@FindBy(id = "label-yes")
	public static WebElement YesRadiobutton;

	// Declaring elements in Over sixty years results page
	@FindBy(id = "prescription-tick")
	public static WebElement NHSPrescriptionTick;

	@FindBy(id = "sight-test-tick")
	public static WebElement NHSSightTestTick;

	@FindBy(id = "dental-exam-tick")
	public static WebElement NHSDentalExamTick;

	@FindBy(id = "dental-treatment-tick")
	public static WebElement NHSDentalTreatmentTick;

	@FindBy(xpath = "//*[@id='paidUniversalCredit_fieldset']/label[1]")
	public static WebElement universalcardyes;

	@FindBy(xpath = "//*[@id='paidUniversalCredit_fieldset']/label[2]")
	public static WebElement universalcardno;

	@FindBy(xpath = "//*[@id='paidUniversalCredit_fieldset']/label[3]")
	public static WebElement universalcardnotyet;

	public void Country(String ss) {

		try {
			// click on next button and select country based on user selection

			NHSHomePgNextButton.click();
			if (ss.equals("Wales")) {
				// if.Countrywales.equals(True)then
				Countrywales.click();
				NHSHomePgNextButton.click();
			} else if (ss.equals("England")) {
				CountryEngland.click();
				NHSHomePgNextButton.click();
			} else if (ss.equals("Scotland")) {
				CountryScotland.click();
				NHSHomePgNextButton.click();
			} else if (ss.equals("Northern Ireland")) {
				CountryNorthernireland.click();
				NHSHomePgNextButton.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void NHSPatientDOB(String d, String mm, String yyyy)

	{
		try {
			Logger.getLogger("Tester");
			NHSPatientday.sendKeys(d);
			NHSPatientmonth.sendKeys(mm);
			NHSPatientyear.sendKeys(yyyy);
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NHSFreeCostMsgCheck() {
		try {
			NHSMsg = NHSFreecost.getText();
			softassert.assertTrue(NHSMsg.contains("You get help with NHS costs"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NHSFreePrescriptionCheck() {
		try {
			NHSPrs = NHSPrescription.getText();
			softassert.assertTrue(NHSPrs.contains("NHS prescriptions"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NHSFreeDentalTreamentsCheck() {
		try {
			NHSDcheck = NHSDentalChecksTreatments.getText();
			softassert.assertTrue(NHSDcheck.contains("NHS dental check-ups and treatment"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NHSFreeSighttests() {
		try {
			NHSFreeSightTest = NHSSightests.getText();
			softassert.assertTrue(NHSFreeSightTest.contains("sight tests"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NHSFreeFabricWigs() {
		try {
			NHSFreeFrabricWig = NHSFabricWigs.getText();
			softassert.assertTrue(NHSFreeFrabricWig.contains("NHS wigs and fabric supports"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NHSMoneyoffGlassesContactlenses() {
		try {

			NHSMoneyOffNewGlasseslenses = NewGlassesContactlenses.getText();
			softassert.assertTrue(NHSMoneyOffNewGlasseslenses.contains("new glasses or contact lenses"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NHSMoneyoffReplaceGlassesContactlenses() {
		try {
			NHSMoneyOffRepairGlasseslenses = RepairReplaceGlassesContactlenses.getText();
			softassert.assertTrue(
					NHSMoneyOffRepairGlasseslenses.contains("repairing or replacing your glasses or contact lenses"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void NHSPayedTravel() {
		try {
			NHSPaidTravel = travelNHStreatment.getText();
			softassert.assertTrue(NHSPaidTravel.contains("travel for NHS treatment"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		

		public void NHSFreePrescriptionCheckforclaim() {
			try {
				NHSPrs = NHSPrescriptionforclaim.getText();
				softassert.assertTrue(NHSPrs.contains("NHS prescriptions"));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void NHSFreeDentalTreamentsCheckforclaim() {
			try {
				NHSDcheck = NHSDentalChecksTreatmentsforclaim.getText();
				softassert.assertTrue(NHSDcheck.contains("NHS dental check-ups and treatment"));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void NHSFreeSighttestsforclaim() {
			try {
				NHSFreeSightTest = NHSSightestsforclaim.getText();
				softassert.assertTrue(NHSFreeSightTest.contains("sight tests"));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void NHSFreeFabricWigsforclaim() {
			try {
				NHSFreeFrabricWig = NHSFabricWigsforclaim.getText();
				softassert.assertTrue(NHSFreeFrabricWig.contains("NHS wigs and fabric supports"));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void NHSMoneyoffGlassesContactlensesforclaim() {
			try {

				NHSMoneyOffNewGlasseslenses = NewGlassesContactlensesforclaim.getText();
				softassert.assertTrue(NHSMoneyOffNewGlasseslenses.contains("new glasses or contact lenses"));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void NHSMoneyoffReplaceGlassesContactlensesforclaim() {
			try {
				NHSMoneyOffRepairGlasseslenses = RepairReplaceGlassesContactlensesforclaim.getText();
				softassert.assertTrue(
						NHSMoneyOffRepairGlasseslenses.contains("repairing or replacing your glasses or contact lenses"));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public void NHSPayedTravelforclaim() {
			try {
				NHSPaidTravel = travelNHStreatmentforclaim.getText();
				softassert.assertTrue(NHSPaidTravel.contains("travel for NHS treatment"));
			} catch (Exception e) {
				e.printStackTrace();
			}


	}

	public void LivingWithPartner(String livinginfo) {
		try {
			if (livinginfo.equals("Yes")) {
				YesRadiobutton.click();

			} else {
				NoRadiobutton.click();
			}
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void PrescriptionTick() {
		try {
			NHSPresTick = NHSPrescriptionTick.getText();
			softassert.assertTrue(NHSPresTick.contains("NHS prescriptions"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void SightTestTick() {
		try {
			SightTestTick = NHSSightTestTick.getText();
			softassert.assertTrue(SightTestTick.contains("sight tests"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void DentalExamTick() {
		try {
			DentalExamTick = NHSDentalExamTick.getText();
			softassert.assertTrue(DentalExamTick.contains("NHS dental check ups"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Dentaltreatments() {
		try {
			DentalTreatment = NHSDentalTreatmentTick.getText();
			softassert.assertTrue(DentalTreatment.contains("NHS dental treatment"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void BenefitsTaxCredit(String BenefitsTaxCredit) throws InterruptedException {
		try {

			if (BenefitsTaxCredit.equals("Yes")) {
				YesRadiobutton.click();
			} else {
				NoRadiobutton.click();

			}
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void InjuryArmedForces(String InjuryArmedForces) {
		try {
			if (InjuryArmedForces.equals("Yes")) {
				YesRadiobutton.click();
			} else {
				NoRadiobutton.click();
			}
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void PermanentlivingCareHome(String PermlivingCareHome) {

		try {
			if (PermlivingCareHome.equals("Yes")) {
				YesRadiobutton.click();

			} else {
				NoRadiobutton.click();

			}
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void OverSixteensaving(String OverSixteenSavings) {
		try {
			if (OverSixteenSavings.equals("Yes")) {
				YesRadiobutton.click();

			} else {
				NoRadiobutton.click();
			}
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void FullTimeEducation(String FullTimeEdu) {
		try {

			if (FullTimeEdu.equals("Yes")) {
				YesRadiobutton.click();

			} else {
				NoRadiobutton.click();
			}
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Pregnant(String Prena) {

		try {
			if (Prena.equals("Yes")) {
				YesRadiobutton.click();

			} else {
				NoRadiobutton.click();
			}

			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Diabetic(String Diabe) {
		try {
			if (Diabe.equals("Yes")) {
				YesRadiobutton.click();
			} else {
				NoRadiobutton.click();

			}
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Gloucoma(String Glouco) {
		try {
			if (Glouco.equals("Yes")) {
				YesRadiobutton.click();

			} else {
				NoRadiobutton.click();
			}
			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void selectpaiduniversalcard(String data) {
		try {
			if (data.equals("Yes, we receive Universal Credit payments")) {
				universalcardyes.click();
			} else if (data.equals("No, we get a different benefit")) {
				universalcardno.click();
			} else {
				universalcardnotyet.click();
			}

			NHSHomePgNextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
