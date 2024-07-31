.class public final enum Lcom/google/protobuf/u;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/u$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/u;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/u;

.field public static final enum BOOL:Lcom/google/protobuf/u;

.field public static final enum BOOL_LIST:Lcom/google/protobuf/u;

.field public static final enum BOOL_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum BYTES:Lcom/google/protobuf/u;

.field public static final enum BYTES_LIST:Lcom/google/protobuf/u;

.field public static final enum DOUBLE:Lcom/google/protobuf/u;

.field public static final enum DOUBLE_LIST:Lcom/google/protobuf/u;

.field public static final enum DOUBLE_LIST_PACKED:Lcom/google/protobuf/u;

.field private static final EMPTY_TYPES:[Ljava/lang/reflect/Type;

.field public static final enum ENUM:Lcom/google/protobuf/u;

.field public static final enum ENUM_LIST:Lcom/google/protobuf/u;

.field public static final enum ENUM_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum FIXED32:Lcom/google/protobuf/u;

.field public static final enum FIXED32_LIST:Lcom/google/protobuf/u;

.field public static final enum FIXED32_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum FIXED64:Lcom/google/protobuf/u;

.field public static final enum FIXED64_LIST:Lcom/google/protobuf/u;

.field public static final enum FIXED64_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum FLOAT:Lcom/google/protobuf/u;

.field public static final enum FLOAT_LIST:Lcom/google/protobuf/u;

.field public static final enum FLOAT_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum GROUP:Lcom/google/protobuf/u;

.field public static final enum GROUP_LIST:Lcom/google/protobuf/u;

.field public static final enum INT32:Lcom/google/protobuf/u;

.field public static final enum INT32_LIST:Lcom/google/protobuf/u;

.field public static final enum INT32_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum INT64:Lcom/google/protobuf/u;

.field public static final enum INT64_LIST:Lcom/google/protobuf/u;

.field public static final enum INT64_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum MAP:Lcom/google/protobuf/u;

.field public static final enum MESSAGE:Lcom/google/protobuf/u;

.field public static final enum MESSAGE_LIST:Lcom/google/protobuf/u;

.field public static final enum SFIXED32:Lcom/google/protobuf/u;

.field public static final enum SFIXED32_LIST:Lcom/google/protobuf/u;

.field public static final enum SFIXED32_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum SFIXED64:Lcom/google/protobuf/u;

.field public static final enum SFIXED64_LIST:Lcom/google/protobuf/u;

.field public static final enum SFIXED64_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum SINT32:Lcom/google/protobuf/u;

.field public static final enum SINT32_LIST:Lcom/google/protobuf/u;

.field public static final enum SINT32_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum SINT64:Lcom/google/protobuf/u;

.field public static final enum SINT64_LIST:Lcom/google/protobuf/u;

.field public static final enum SINT64_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum STRING:Lcom/google/protobuf/u;

.field public static final enum STRING_LIST:Lcom/google/protobuf/u;

.field public static final enum UINT32:Lcom/google/protobuf/u;

.field public static final enum UINT32_LIST:Lcom/google/protobuf/u;

.field public static final enum UINT32_LIST_PACKED:Lcom/google/protobuf/u;

.field public static final enum UINT64:Lcom/google/protobuf/u;

.field public static final enum UINT64_LIST:Lcom/google/protobuf/u;

.field public static final enum UINT64_LIST_PACKED:Lcom/google/protobuf/u;

.field private static final VALUES:[Lcom/google/protobuf/u;


# instance fields
.field private final collection:Lcom/google/protobuf/u$b;

.field private final elementType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final id:I

.field private final javaType:Lcom/google/protobuf/c0;

.field private final primitiveScalar:Z


# direct methods
.method static constructor <clinit>()V
    .locals 23

    new-instance v6, Lcom/google/protobuf/u;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v13, Lcom/google/protobuf/u$b;->SCALAR:Lcom/google/protobuf/u$b;

    sget-object v14, Lcom/google/protobuf/c0;->DOUBLE:Lcom/google/protobuf/c0;

    move-object v0, v6

    move-object v4, v13

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v6, Lcom/google/protobuf/u;->DOUBLE:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "FLOAT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    sget-object v15, Lcom/google/protobuf/c0;->FLOAT:Lcom/google/protobuf/c0;

    move-object v7, v0

    move-object v11, v13

    move-object v12, v15

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FLOAT:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "INT64"

    const/4 v9, 0x2

    const/4 v10, 0x2

    sget-object v16, Lcom/google/protobuf/c0;->LONG:Lcom/google/protobuf/c0;

    move-object v7, v0

    move-object/from16 v12, v16

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->INT64:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "UINT64"

    const/4 v9, 0x3

    const/4 v10, 0x3

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->UINT64:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "INT32"

    const/4 v9, 0x4

    const/4 v10, 0x4

    sget-object v17, Lcom/google/protobuf/c0;->INT:Lcom/google/protobuf/c0;

    move-object v7, v0

    move-object/from16 v12, v17

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->INT32:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "FIXED64"

    const/4 v9, 0x5

    const/4 v10, 0x5

    move-object v7, v0

    move-object/from16 v12, v16

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FIXED64:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "FIXED32"

    const/4 v9, 0x6

    const/4 v10, 0x6

    move-object v7, v0

    move-object/from16 v12, v17

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FIXED32:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "BOOL"

    const/4 v9, 0x7

    const/4 v10, 0x7

    sget-object v18, Lcom/google/protobuf/c0;->BOOLEAN:Lcom/google/protobuf/c0;

    move-object v7, v0

    move-object/from16 v12, v18

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->BOOL:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "STRING"

    const/16 v9, 0x8

    const/16 v10, 0x8

    sget-object v19, Lcom/google/protobuf/c0;->STRING:Lcom/google/protobuf/c0;

    move-object v7, v0

    move-object/from16 v12, v19

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->STRING:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "MESSAGE"

    const/16 v9, 0x9

    const/16 v10, 0x9

    sget-object v20, Lcom/google/protobuf/c0;->MESSAGE:Lcom/google/protobuf/c0;

    move-object v7, v0

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->MESSAGE:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "BYTES"

    const/16 v9, 0xa

    const/16 v10, 0xa

    sget-object v21, Lcom/google/protobuf/c0;->BYTE_STRING:Lcom/google/protobuf/c0;

    move-object v7, v0

    move-object/from16 v12, v21

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->BYTES:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "UINT32"

    const/16 v9, 0xb

    const/16 v10, 0xb

    move-object v7, v0

    move-object/from16 v12, v17

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->UINT32:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "ENUM"

    const/16 v9, 0xc

    const/16 v10, 0xc

    sget-object v22, Lcom/google/protobuf/c0;->ENUM:Lcom/google/protobuf/c0;

    move-object v7, v0

    move-object/from16 v12, v22

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->ENUM:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "SFIXED32"

    const/16 v9, 0xd

    const/16 v10, 0xd

    move-object v7, v0

    move-object/from16 v12, v17

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SFIXED32:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "SFIXED64"

    const/16 v9, 0xe

    const/16 v10, 0xe

    move-object v7, v0

    move-object/from16 v12, v16

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SFIXED64:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "SINT32"

    const/16 v9, 0xf

    const/16 v10, 0xf

    move-object v7, v0

    move-object/from16 v12, v17

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SINT32:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "SINT64"

    const/16 v9, 0x10

    const/16 v10, 0x10

    move-object v7, v0

    move-object/from16 v12, v16

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SINT64:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "GROUP"

    const/16 v9, 0x11

    const/16 v10, 0x11

    move-object v7, v0

    move-object/from16 v12, v20

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->GROUP:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "DOUBLE_LIST"

    const/16 v9, 0x12

    const/16 v10, 0x12

    sget-object v13, Lcom/google/protobuf/u$b;->VECTOR:Lcom/google/protobuf/u$b;

    move-object v7, v0

    move-object v11, v13

    move-object v12, v14

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->DOUBLE_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "FLOAT_LIST"

    const/16 v3, 0x13

    const/16 v4, 0x13

    move-object v1, v0

    move-object v5, v13

    move-object v6, v15

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FLOAT_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "INT64_LIST"

    const/16 v3, 0x14

    const/16 v4, 0x14

    move-object v1, v0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->INT64_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "UINT64_LIST"

    const/16 v3, 0x15

    const/16 v4, 0x15

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->UINT64_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "INT32_LIST"

    const/16 v3, 0x16

    const/16 v4, 0x16

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->INT32_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "FIXED64_LIST"

    const/16 v3, 0x17

    const/16 v4, 0x17

    move-object v1, v0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FIXED64_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "FIXED32_LIST"

    const/16 v3, 0x18

    const/16 v4, 0x18

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FIXED32_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "BOOL_LIST"

    const/16 v3, 0x19

    const/16 v4, 0x19

    move-object v1, v0

    move-object/from16 v6, v18

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->BOOL_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "STRING_LIST"

    const/16 v3, 0x1a

    const/16 v4, 0x1a

    move-object v1, v0

    move-object/from16 v6, v19

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->STRING_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "MESSAGE_LIST"

    const/16 v3, 0x1b

    const/16 v4, 0x1b

    move-object v1, v0

    move-object/from16 v6, v20

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->MESSAGE_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "BYTES_LIST"

    const/16 v3, 0x1c

    const/16 v4, 0x1c

    move-object v1, v0

    move-object/from16 v6, v21

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->BYTES_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "UINT32_LIST"

    const/16 v3, 0x1d

    const/16 v4, 0x1d

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->UINT32_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "ENUM_LIST"

    const/16 v3, 0x1e

    const/16 v4, 0x1e

    move-object v1, v0

    move-object/from16 v6, v22

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->ENUM_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "SFIXED32_LIST"

    const/16 v3, 0x1f

    const/16 v4, 0x1f

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SFIXED32_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "SFIXED64_LIST"

    const/16 v3, 0x20

    const/16 v4, 0x20

    move-object v1, v0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SFIXED64_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "SINT32_LIST"

    const/16 v3, 0x21

    const/16 v4, 0x21

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SINT32_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "SINT64_LIST"

    const/16 v3, 0x22

    const/16 v4, 0x22

    move-object v1, v0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SINT64_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v8, "DOUBLE_LIST_PACKED"

    const/16 v9, 0x23

    const/16 v10, 0x23

    sget-object v19, Lcom/google/protobuf/u$b;->PACKED_VECTOR:Lcom/google/protobuf/u$b;

    move-object v7, v0

    move-object/from16 v11, v19

    invoke-direct/range {v7 .. v12}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->DOUBLE_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "FLOAT_LIST_PACKED"

    const/16 v3, 0x24

    const/16 v4, 0x24

    move-object v1, v0

    move-object/from16 v5, v19

    move-object v6, v15

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FLOAT_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "INT64_LIST_PACKED"

    const/16 v3, 0x25

    const/16 v4, 0x25

    move-object v1, v0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->INT64_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "UINT64_LIST_PACKED"

    const/16 v3, 0x26

    const/16 v4, 0x26

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->UINT64_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "INT32_LIST_PACKED"

    const/16 v3, 0x27

    const/16 v4, 0x27

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->INT32_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "FIXED64_LIST_PACKED"

    const/16 v3, 0x28

    const/16 v4, 0x28

    move-object v1, v0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FIXED64_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "FIXED32_LIST_PACKED"

    const/16 v3, 0x29

    const/16 v4, 0x29

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->FIXED32_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "BOOL_LIST_PACKED"

    const/16 v3, 0x2a

    const/16 v4, 0x2a

    move-object v1, v0

    move-object/from16 v6, v18

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->BOOL_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "UINT32_LIST_PACKED"

    const/16 v3, 0x2b

    const/16 v4, 0x2b

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->UINT32_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "ENUM_LIST_PACKED"

    const/16 v3, 0x2c

    const/16 v4, 0x2c

    move-object v1, v0

    move-object/from16 v6, v22

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->ENUM_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "SFIXED32_LIST_PACKED"

    const/16 v3, 0x2d

    const/16 v4, 0x2d

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SFIXED32_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "SFIXED64_LIST_PACKED"

    const/16 v3, 0x2e

    const/16 v4, 0x2e

    move-object v1, v0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SFIXED64_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "SINT32_LIST_PACKED"

    const/16 v3, 0x2f

    const/16 v4, 0x2f

    move-object v1, v0

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SINT32_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "SINT64_LIST_PACKED"

    const/16 v3, 0x30

    const/16 v4, 0x30

    move-object v1, v0

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->SINT64_LIST_PACKED:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v2, "GROUP_LIST"

    const/16 v3, 0x31

    const/16 v4, 0x31

    move-object v1, v0

    move-object v5, v13

    move-object/from16 v6, v20

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->GROUP_LIST:Lcom/google/protobuf/u;

    new-instance v0, Lcom/google/protobuf/u;

    const-string v6, "MAP"

    const/16 v7, 0x32

    const/16 v8, 0x32

    sget-object v9, Lcom/google/protobuf/u$b;->MAP:Lcom/google/protobuf/u$b;

    sget-object v10, Lcom/google/protobuf/c0;->VOID:Lcom/google/protobuf/c0;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lcom/google/protobuf/u;-><init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V

    sput-object v0, Lcom/google/protobuf/u;->MAP:Lcom/google/protobuf/u;

    invoke-static {}, Lcom/google/protobuf/u;->b()[Lcom/google/protobuf/u;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/u;->$VALUES:[Lcom/google/protobuf/u;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/reflect/Type;

    sput-object v1, Lcom/google/protobuf/u;->EMPTY_TYPES:[Ljava/lang/reflect/Type;

    invoke-static {}, Lcom/google/protobuf/u;->values()[Lcom/google/protobuf/u;

    move-result-object v1

    array-length v2, v1

    new-array v2, v2, [Lcom/google/protobuf/u;

    sput-object v2, Lcom/google/protobuf/u;->VALUES:[Lcom/google/protobuf/u;

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    sget-object v4, Lcom/google/protobuf/u;->VALUES:[Lcom/google/protobuf/u;

    iget v5, v3, Lcom/google/protobuf/u;->id:I

    aput-object v3, v4, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILcom/google/protobuf/u$b;Lcom/google/protobuf/c0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/protobuf/u$b;",
            "Lcom/google/protobuf/c0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/protobuf/u;->id:I

    iput-object p4, p0, Lcom/google/protobuf/u;->collection:Lcom/google/protobuf/u$b;

    iput-object p5, p0, Lcom/google/protobuf/u;->javaType:Lcom/google/protobuf/c0;

    sget-object p1, Lcom/google/protobuf/u$a;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x2

    const/4 p3, 0x1

    if-eq p1, p3, :cond_0

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lcom/google/protobuf/c0;->h()Ljava/lang/Class;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/protobuf/u;->elementType:Ljava/lang/Class;

    sget-object p1, Lcom/google/protobuf/u$b;->SCALAR:Lcom/google/protobuf/u$b;

    if-ne p4, p1, :cond_1

    sget-object p1, Lcom/google/protobuf/u$a;->b:[I

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p1, p1, p4

    if-eq p1, p3, :cond_1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    iput-boolean p3, p0, Lcom/google/protobuf/u;->primitiveScalar:Z

    return-void
.end method

.method private static synthetic b()[Lcom/google/protobuf/u;
    .locals 3

    const/16 v0, 0x33

    new-array v0, v0, [Lcom/google/protobuf/u;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/protobuf/u;->DOUBLE:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/protobuf/u;->FLOAT:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/google/protobuf/u;->INT64:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/google/protobuf/u;->UINT64:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/google/protobuf/u;->INT32:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/google/protobuf/u;->FIXED64:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/google/protobuf/u;->FIXED32:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/google/protobuf/u;->BOOL:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/google/protobuf/u;->STRING:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/google/protobuf/u;->MESSAGE:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/google/protobuf/u;->BYTES:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/google/protobuf/u;->UINT32:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/google/protobuf/u;->ENUM:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/google/protobuf/u;->SFIXED32:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/google/protobuf/u;->SFIXED64:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/google/protobuf/u;->SINT32:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/google/protobuf/u;->SINT64:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/google/protobuf/u;->GROUP:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/google/protobuf/u;->DOUBLE_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/google/protobuf/u;->FLOAT_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lcom/google/protobuf/u;->INT64_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lcom/google/protobuf/u;->UINT64_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lcom/google/protobuf/u;->INT32_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lcom/google/protobuf/u;->FIXED64_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lcom/google/protobuf/u;->FIXED32_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x19

    sget-object v2, Lcom/google/protobuf/u;->BOOL_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    sget-object v2, Lcom/google/protobuf/u;->STRING_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    sget-object v2, Lcom/google/protobuf/u;->MESSAGE_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    sget-object v2, Lcom/google/protobuf/u;->BYTES_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    sget-object v2, Lcom/google/protobuf/u;->UINT32_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    sget-object v2, Lcom/google/protobuf/u;->ENUM_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    sget-object v2, Lcom/google/protobuf/u;->SFIXED32_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x20

    sget-object v2, Lcom/google/protobuf/u;->SFIXED64_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x21

    sget-object v2, Lcom/google/protobuf/u;->SINT32_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x22

    sget-object v2, Lcom/google/protobuf/u;->SINT64_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x23

    sget-object v2, Lcom/google/protobuf/u;->DOUBLE_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x24

    sget-object v2, Lcom/google/protobuf/u;->FLOAT_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x25

    sget-object v2, Lcom/google/protobuf/u;->INT64_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x26

    sget-object v2, Lcom/google/protobuf/u;->UINT64_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x27

    sget-object v2, Lcom/google/protobuf/u;->INT32_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x28

    sget-object v2, Lcom/google/protobuf/u;->FIXED64_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x29

    sget-object v2, Lcom/google/protobuf/u;->FIXED32_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x2a

    sget-object v2, Lcom/google/protobuf/u;->BOOL_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x2b

    sget-object v2, Lcom/google/protobuf/u;->UINT32_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x2c

    sget-object v2, Lcom/google/protobuf/u;->ENUM_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x2d

    sget-object v2, Lcom/google/protobuf/u;->SFIXED32_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x2e

    sget-object v2, Lcom/google/protobuf/u;->SFIXED64_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x2f

    sget-object v2, Lcom/google/protobuf/u;->SINT32_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x30

    sget-object v2, Lcom/google/protobuf/u;->SINT64_LIST_PACKED:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x31

    sget-object v2, Lcom/google/protobuf/u;->GROUP_LIST:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    const/16 v1, 0x32

    sget-object v2, Lcom/google/protobuf/u;->MAP:Lcom/google/protobuf/u;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/u;
    .locals 1

    const-class v0, Lcom/google/protobuf/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/u;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/u;
    .locals 1

    sget-object v0, Lcom/google/protobuf/u;->$VALUES:[Lcom/google/protobuf/u;

    invoke-virtual {v0}, [Lcom/google/protobuf/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/u;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/u;->id:I

    return v0
.end method
