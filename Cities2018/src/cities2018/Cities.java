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
        Map<String,String> map = new HashMap();
        for(String key : provinces.keySet())
        {
            List<String> list = provinces.get(key);
            String city = list.get(0);
            map.put(key, city);
        }
        return map;
    }
    
    public Collection<String> cities()
    {
        Collection<String> col = new ArrayList();
        for(List<String> list : provinces.values())
        {
            col.addAll(list);
        }
        return col;
    }
    
    public static void main(String[] args) 
    {
        Cities c= new Cities();
        System.out.println(c.provinces);
        System.out.println(c.cities());
        System.out.println(c.provinceWithOneCity());
    }
    
}
