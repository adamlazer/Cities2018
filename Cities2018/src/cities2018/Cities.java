/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cities {
    private Map<String,List<String>> provinces = new HashMap();

    public Cities() {
        List<String> list1 = new ArrayList();
        list1.add("Elbląg");
        list1.add("Olsztyn");
        provinces.put("warmińsko-mazurskie", list1);
        List<String> list2 = Arrays.asList("Gdańsk","Sopot","Gdynia");
        provinces.put("pomorskie", list2);
    }
    
    public Collection<String> provinces()
    {
        return provinces.keySet();
    }
    
    public List<String> cities(String province)
    {
        return provinces.get(province);
    }
    
    public Map<String,String> provinceWithOneCity()
    {
        return null;
    }
    
    public Collection<String> cities()
    {
        return null;
    }
    
    public static void main(String[] args) 
    {
        Cities c= new Cities();
        System.out.println(c.provinces);
    }
    
}
