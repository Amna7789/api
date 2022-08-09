package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.domain.GradesDTOIn;
import com.Amy.Api.domain.ResultAnnounceDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class TaskController {

    @PostMapping("/grade")
       public  ResultAnnounceDTO getResult(@RequestBody GradesDTOIn gradesDTOIn){
        return getEnemyResult(gradesDTOIn);


        }
        public ResultAnnounceDTO getEnemyResult(GradesDTOIn gradesDTOIn){
            double sum = gradesDTOIn.getBio() + gradesDTOIn.getPHP() + gradesDTOIn.getMath()+
                    gradesDTOIn.getPhy() + gradesDTOIn.getJava();
            double percentage = sum/500 * 100;
            ResultAnnounceDTO ra = new ResultAnnounceDTO();
            ra.setSum(sum);
            ra.setPercentage(percentage);
            if(percentage > 40.0){
                ra.setStatusType("PASS");
                ra.setDes("Student has passed all the courses");
                return ra;
            }
            else{
                ra.setStatusType("FAIL");
                ra.setDes("Student has failed due to low percenatage ");
                return ra;
            }
        }
    }

























   /* @GetMapping("/WebPage")
    public String getWebPage(){
        return "Web-Page ";
    }

    @GetMapping("AppPage")
    public String getAppPage(){
        return "Application pages";
    }
    List<String> clients = List.of("Amna", "Usman", "Ameena", "Usman Ali");
    @GetMapping("/AllClients")

    public List getAllClients(){
        return clients;
    }

    @GetMapping("/Clients")
     List getClientsByName(@RequestParam("name")String name){

        List filteredClients = new ArrayList<>();
        for(int i = 0; i < clients.size(); i++){
//            clients.get(i).toLowerCase(Locale.ROOT) ;
//            name.toLowerCase(Locale.ROOT);


            if(clients.get(i).toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                //System.out.println(clients.get(i));
                filteredClients.add(clients.get(i));
            }
        }
        return filteredClients;
    }



    @GetMapping("/findClient")
    List findClientsByName(@RequestParam("name")String name){

        List filteredClients = new ArrayList<>();

        clients.forEach( client -> {
            if(client.toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                filteredClients.add(client);
            }
        });

        return filteredClients;
    }*/




