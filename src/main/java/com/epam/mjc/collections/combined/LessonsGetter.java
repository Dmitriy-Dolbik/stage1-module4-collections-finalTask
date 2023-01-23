package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter
{
    public Set<String> getLessons(Map<String, List<String>> timetable)
    {
        Set<String> lessonsSet = new HashSet<>();

        for (List<String> lessonsList : timetable.values())
        {
            for (String lesson : lessonsList)
            {
                lessonsSet.add(lesson);
            }
        }
        return lessonsSet;
    }
}
