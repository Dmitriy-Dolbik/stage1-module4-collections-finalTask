package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator
{
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap)
    {

        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> sourcePairs : sourceMap.entrySet())
        {
            Integer lengthSourceMapKey = sourcePairs.getKey().length();
            if (resultMap.containsKey(lengthSourceMapKey))
            {
                resultMap.get(lengthSourceMapKey).add(sourcePairs.getKey());
            }
            else
            {
                resultMap.put(lengthSourceMapKey, new HashSet(List.of(sourcePairs.getKey())));
            }
        }
        return resultMap;
    }
}
