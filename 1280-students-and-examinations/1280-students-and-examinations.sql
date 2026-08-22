# Write your MySQL query statement below
select student_id, student_name,subject_name , Count(estu) as attended_exams
from(
    select s.student_id,s.student_name,su.subject_name, e.student_id as estu from Students s cross Join Subjects su Left join Examinations e ON s.student_id = e.student_id
AND su.subject_name = e.subject_name

)x
group by  student_id, student_name,subject_name
order by student_id,subject_name