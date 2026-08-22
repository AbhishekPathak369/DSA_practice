# Write your MySQL query statement below
select machine_id,Round(AVG(processing_time),3) as processing_time  from (
    select machine_id,process_id, 
    MAX(Case when activity_type = "end" then timestamp END)-
    MAX(Case when activity_type= "start" then timestamp END) As processing_time
    from Activity
    group by machine_id,process_id
)x
group by machine_id