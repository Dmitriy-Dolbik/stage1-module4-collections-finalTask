package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder
{
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer)
    {

        List<String> developerProjectList = new ArrayList<>();

        for (Map.Entry<String, Set<String>> project : projects.entrySet())
        {
            Set<String> listOfDevelopers = project.getValue();
            if (listOfDevelopers.contains(developer))
            {
                String projectTitle = project.getKey();
                developerProjectList.add(projectTitle);
            }
        }
        Collections.sort(developerProjectList, new MyComparator());
        return developerProjectList;
    }
}

class MyComparator implements Comparator<String>
{

    @Override
    public int compare(final String o1, final String o2)
    {
        int comparison = Integer.compare(o2.length(), o1.length());
        if (comparison == 0)
        {
            comparison = o2.compareTo(o1);
        }
        return comparison;
    }
}
