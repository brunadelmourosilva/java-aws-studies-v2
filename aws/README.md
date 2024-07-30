
# **AWS - features and studies**

## **TO STUDY**


## **LEARNED**

#### CDC (change data capture) pattern with AWS DMS

- https://hands-on.cloud/cloudformation-dms-template/
https://stackoverflow.com/questions/70764178/cloudformation-sample-template-for-for-aws-dms

- https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Monitoring.html

RDS permissions: 
- https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html

Redshift:
- https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redshift.html

- https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Amazon-Managed.Configuration

Mapping rules:
- https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.SelectionTransformation.Transformations.html

- https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Troubleshooting.html#CHAP_Troubleshooting.General.NothingMigrated

- https://repost.aws/knowledge-center/dms-error-task-initialization-tables

---

#### INTRINSIC FUNCTIONS ON CF

Ref function 

- https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html

Specific returned values - !Ref and !GetAtt

- https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html

- https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#aws-resource-dms-certificate-return-values

- https://stackoverflow.com/questions/77657297/how-can-a-cloudformation-resource-refer-to-another-resource-in-the-same-nested-t

- https://stackoverflow.com/questions/58617503/cloudformation-when-to-use-getatt-ref-vs#:~:text=GetAtt%20is%20essentially%20the%20same,from%20different%20attributes%20to%20return.
  
- https://stackoverflow.com/questions/59143563/value-of-property-parameters-must-be-an-object-with-string-or-simple-type-prop

---

#### AWS - DYNAMIC REFERENCES ON CF

- https://docs.aws.amazon.com/secretsmanager/latest/userguide/cfn-example_reference-secret.html

- https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager

- https://stackoverflow.com/questions/56657592/reading-a-secret-using-cloudformation

---

#### CLOUD FORMATION VALIDATOR

- IntelliJ plugin

- https://us-east-2.console.aws.amazon.com/composer/canvas?region=us-east-2 
  
- https://us-east-2.console.aws.amazon.com/cloudformation/designer/home?region=us-east-2#
  
- https://docs.aws.amazon.com/application-composer/latest/dg/what-is-composer.html

- https://docs.aws.amazon.com/pt_br/AWSCloudFormation/latest/UserGuide/using-cfn-validate-template.html

---

#### Solving problem between kinesis firehose and opensearch

- https://stackoverflow.com/questions/62351965/aws-permissions-error-kinesis-firehose-is-not-sending-data-to-elasticsearch

- https://repost.aws/pt/knowledge-center/opensearch-troubleshoot-cloudwatch-logs

---

#### OpenSearch API


- https://opensearch.org/docs/latest/dashboards/management/index-patterns/

- https://opensearch.org/docs/1.1/opensearch/rest-api/cat/index/

- https://opensearch.org/docs/1.1/opensearch/rest-api/index-apis/delete-index/#response

Create index and documents

- https://opensearch.org/docs/latest/api-reference/index-apis/create-index/

- https://opensearch.org/docs/1.0/opensearch/rest-api/document-apis/index-document/

---

#### How service-accounts works on CF

Criar um AWS user para o microservice Java (AWS::IAM::User) -> Criar policy com as permissões (AWS::IAM::ManagedPolicy) -> Anexar policy criada no user (ManagedPolicyArns) -> Anexar user criado a uma access key (AWS::IAM::AccessKey)

---

