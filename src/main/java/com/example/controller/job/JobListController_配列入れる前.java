//package com.example.controller.job;
//
//import java.util.List;
//import java.util.Objects;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.domain.Job;
//import com.example.service.job.EnService;
//
///**
// * 求人一覧のコントローラー.
// * 
// * @author oyamadakenji
// *
// */
//@Controller
//@RequestMapping("/job-list")
//public class JobListController_配列入れる前 {
//
//	@Autowired
//	private EnService enService;
//	
//	/**
//	 * 求人一覧画面へ.
//	 * 
//	 * @return 求人一覧
//	 */
//	@RequestMapping("/to-job-list")
//	public String toJobList(Integer siteNumber,Integer codingLanguageNumber, Integer page, Model model) {
//		
//		List<Job> jobList = null;
//		
//		if(Objects.isNull(siteNumber)) {
//			siteNumber = 1;
//		}
//
//		if(Objects.isNull(codingLanguageNumber)) {
//			codingLanguageNumber = 1;
//		}
//		
//		if(Objects.isNull(page)) {
//			page = 1;
//		}
//		model.addAttribute("page",page);
//		
//		String codingLanguage = null;
//		switch (codingLanguageNumber){
//		  case 1:
//			  codingLanguage = "Java";
//			  break;
//		  case 2:
//			  codingLanguage = "Ruby";
//			  break;
//		  case 3:
//			  codingLanguage = "PHP";
//			  break;
//		  case 4:
//			  codingLanguage = "C++";
//			  break;
//		  case 5:
//			  codingLanguage = "C#";
//			  break;
//		  case 6:
//			  codingLanguage = "COBOL";
//			  break;
//		  case 7:
//			  codingLanguage = "Go";
//			  break;
//		  case 8:
//			  codingLanguage = "Kotlin";
//			  break;
//		  case 9:
//			  codingLanguage = "Perl";
//			  break;
//		  case 10:
//			  codingLanguage = "Python";
//			  break;
//		  case 11:
//			  codingLanguage = "R";
//			  break;
//		  case 12:
//			  codingLanguage = "Scala";
//			  break;
//		  case 13:
//			  codingLanguage = "Swift";
//			  break;
//		  case 14:
//			  codingLanguage = "TypeScript";
//			  break;
//		}
//		model.addAttribute("codingLanguageName",codingLanguage);
//		model.addAttribute("codingLanguageNumber",codingLanguageNumber);
//
//		switch (siteNumber){
//		  case 1:
//			  jobList = enService.searchJob(codingLanguage,page);
//			  model.addAttribute("siteName","エン転職");
//			  break;
//		  case 2:
//			  jobList = enService.searchJob(codingLanguage,page);
//			  model.addAttribute("siteName","キャリトレ");
//			  break;
//		  case 3:
//			  System.out.println("3");
//			  break;
//		  case 4:
//			    System.out.println("4");
//			    break;
//		  case 5:
//				System.out.println("5");
//				break;
//		  case 6:
//				System.out.println("6");
//				break;
//		  case 7:
//			    System.out.println("7");
//			    break;
//		  case 8:
//			    System.out.println("8");
//			    break;
//		}
//		model.addAttribute("siteNumber",siteNumber);
//		
//		Integer totalPage = enService.countTotalPage(codingLanguage,50);
//		model.addAttribute("totalPage",totalPage);
//	    model.addAttribute("jobList",jobList);
//		return "job/job_list";
//	}	
//}
