.class public enum Lcom/google/protobuf/t1$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/t1$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/t1$b;

.field public static final enum BOOL:Lcom/google/protobuf/t1$b;

.field public static final enum BYTES:Lcom/google/protobuf/t1$b;

.field public static final enum DOUBLE:Lcom/google/protobuf/t1$b;

.field public static final enum ENUM:Lcom/google/protobuf/t1$b;

.field public static final enum FIXED32:Lcom/google/protobuf/t1$b;

.field public static final enum FIXED64:Lcom/google/protobuf/t1$b;

.field public static final enum FLOAT:Lcom/google/protobuf/t1$b;

.field public static final enum GROUP:Lcom/google/protobuf/t1$b;

.field public static final enum INT32:Lcom/google/protobuf/t1$b;

.field public static final enum INT64:Lcom/google/protobuf/t1$b;

.field public static final enum MESSAGE:Lcom/google/protobuf/t1$b;

.field public static final enum SFIXED32:Lcom/google/protobuf/t1$b;

.field public static final enum SFIXED64:Lcom/google/protobuf/t1$b;

.field public static final enum SINT32:Lcom/google/protobuf/t1$b;

.field public static final enum SINT64:Lcom/google/protobuf/t1$b;

.field public static final enum STRING:Lcom/google/protobuf/t1$b;

.field public static final enum UINT32:Lcom/google/protobuf/t1$b;

.field public static final enum UINT64:Lcom/google/protobuf/t1$b;


# instance fields
.field private final javaType:Lcom/google/protobuf/t1$c;

.field private final wireType:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/google/protobuf/t1$b;

    sget-object v1, Lcom/google/protobuf/t1$c;->DOUBLE:Lcom/google/protobuf/t1$c;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->DOUBLE:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    sget-object v1, Lcom/google/protobuf/t1$c;->FLOAT:Lcom/google/protobuf/t1$c;

    const-string v2, "FLOAT"

    const/4 v5, 0x5

    invoke-direct {v0, v2, v4, v1, v5}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->FLOAT:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    sget-object v1, Lcom/google/protobuf/t1$c;->LONG:Lcom/google/protobuf/t1$c;

    const-string v2, "INT64"

    const/4 v6, 0x2

    invoke-direct {v0, v2, v6, v1, v3}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->INT64:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const-string v2, "UINT64"

    const/4 v7, 0x3

    invoke-direct {v0, v2, v7, v1, v3}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->UINT64:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    sget-object v2, Lcom/google/protobuf/t1$c;->INT:Lcom/google/protobuf/t1$c;

    const-string v8, "INT32"

    const/4 v9, 0x4

    invoke-direct {v0, v8, v9, v2, v3}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->INT32:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const-string v8, "FIXED64"

    invoke-direct {v0, v8, v5, v1, v4}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->FIXED64:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const-string v8, "FIXED32"

    const/4 v9, 0x6

    invoke-direct {v0, v8, v9, v2, v5}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->FIXED32:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const/4 v8, 0x7

    sget-object v9, Lcom/google/protobuf/t1$c;->BOOLEAN:Lcom/google/protobuf/t1$c;

    const-string v10, "BOOL"

    invoke-direct {v0, v10, v8, v9, v3}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->BOOL:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b$a;

    const/16 v8, 0x8

    sget-object v9, Lcom/google/protobuf/t1$c;->STRING:Lcom/google/protobuf/t1$c;

    const-string v10, "STRING"

    invoke-direct {v0, v10, v8, v9, v6}, Lcom/google/protobuf/t1$b$a;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->STRING:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b$b;

    sget-object v8, Lcom/google/protobuf/t1$c;->MESSAGE:Lcom/google/protobuf/t1$c;

    const-string v9, "GROUP"

    const/16 v10, 0x9

    invoke-direct {v0, v9, v10, v8, v7}, Lcom/google/protobuf/t1$b$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->GROUP:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b$c;

    const-string v7, "MESSAGE"

    const/16 v9, 0xa

    invoke-direct {v0, v7, v9, v8, v6}, Lcom/google/protobuf/t1$b$c;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->MESSAGE:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b$d;

    const/16 v7, 0xb

    sget-object v8, Lcom/google/protobuf/t1$c;->BYTE_STRING:Lcom/google/protobuf/t1$c;

    const-string v9, "BYTES"

    invoke-direct {v0, v9, v7, v8, v6}, Lcom/google/protobuf/t1$b$d;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->BYTES:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const-string v6, "UINT32"

    const/16 v7, 0xc

    invoke-direct {v0, v6, v7, v2, v3}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->UINT32:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const/16 v6, 0xd

    sget-object v7, Lcom/google/protobuf/t1$c;->ENUM:Lcom/google/protobuf/t1$c;

    const-string v8, "ENUM"

    invoke-direct {v0, v8, v6, v7, v3}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->ENUM:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const-string v6, "SFIXED32"

    const/16 v7, 0xe

    invoke-direct {v0, v6, v7, v2, v5}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->SFIXED32:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const-string v5, "SFIXED64"

    const/16 v6, 0xf

    invoke-direct {v0, v5, v6, v1, v4}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->SFIXED64:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const-string v4, "SINT32"

    const/16 v5, 0x10

    invoke-direct {v0, v4, v5, v2, v3}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->SINT32:Lcom/google/protobuf/t1$b;

    new-instance v0, Lcom/google/protobuf/t1$b;

    const-string v2, "SINT64"

    const/16 v4, 0x11

    invoke-direct {v0, v2, v4, v1, v3}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    sput-object v0, Lcom/google/protobuf/t1$b;->SINT64:Lcom/google/protobuf/t1$b;

    invoke-static {}, Lcom/google/protobuf/t1$b;->b()[Lcom/google/protobuf/t1$b;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/t1$b;->$VALUES:[Lcom/google/protobuf/t1$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/t1$c;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/protobuf/t1$b;->javaType:Lcom/google/protobuf/t1$c;

    iput p4, p0, Lcom/google/protobuf/t1$b;->wireType:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;ILcom/google/protobuf/t1$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/protobuf/t1$b;-><init>(Ljava/lang/String;ILcom/google/protobuf/t1$c;I)V

    return-void
.end method

.method private static synthetic b()[Lcom/google/protobuf/t1$b;
    .locals 3

    const/16 v0, 0x12

    new-array v0, v0, [Lcom/google/protobuf/t1$b;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/protobuf/t1$b;->DOUBLE:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/protobuf/t1$b;->FLOAT:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/google/protobuf/t1$b;->INT64:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/google/protobuf/t1$b;->UINT64:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/google/protobuf/t1$b;->INT32:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/google/protobuf/t1$b;->FIXED64:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/google/protobuf/t1$b;->FIXED32:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/google/protobuf/t1$b;->BOOL:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/google/protobuf/t1$b;->STRING:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/google/protobuf/t1$b;->GROUP:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/google/protobuf/t1$b;->MESSAGE:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/google/protobuf/t1$b;->BYTES:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/google/protobuf/t1$b;->UINT32:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/google/protobuf/t1$b;->ENUM:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/google/protobuf/t1$b;->SFIXED32:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/google/protobuf/t1$b;->SFIXED64:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/google/protobuf/t1$b;->SINT32:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/google/protobuf/t1$b;->SINT64:Lcom/google/protobuf/t1$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/t1$b;
    .locals 1

    const-class v0, Lcom/google/protobuf/t1$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/t1$b;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/t1$b;
    .locals 1

    sget-object v0, Lcom/google/protobuf/t1$b;->$VALUES:[Lcom/google/protobuf/t1$b;

    invoke-virtual {v0}, [Lcom/google/protobuf/t1$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/t1$b;

    return-object v0
.end method


# virtual methods
.method public h()Lcom/google/protobuf/t1$c;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/t1$b;->javaType:Lcom/google/protobuf/t1$c;

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/t1$b;->wireType:I

    return v0
.end method
