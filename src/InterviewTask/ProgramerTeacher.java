package InterviewTask;

import ArrayListPractice.ArrayListFirstClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProgramerTeacher extends Programmer {

    List<String> teacherLanguages = new ArrayList<String>();

    @Override
    public Collection<String> getAllLanguages(){
        return teacherLanguages;
    }
    @Override
    public void addLanguage(String language){
        teacherLanguages.add(language);
    }

    public boolean teach(Programmer programmer,String language){
        for(String teacherl : teacherLanguages){
            if(teacherl == language){
                programmer.addLanguage(language);
                return true;
            }
        }
        return false;
    }




}
