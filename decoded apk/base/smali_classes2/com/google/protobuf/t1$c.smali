.class public final enum Lcom/google/protobuf/t1$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/t1$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/t1$c;

.field public static final enum BOOLEAN:Lcom/google/protobuf/t1$c;

.field public static final enum BYTE_STRING:Lcom/google/protobuf/t1$c;

.field public static final enum DOUBLE:Lcom/google/protobuf/t1$c;

.field public static final enum ENUM:Lcom/google/protobuf/t1$c;

.field public static final enum FLOAT:Lcom/google/protobuf/t1$c;

.field public static final enum INT:Lcom/google/protobuf/t1$c;

.field public static final enum LONG:Lcom/google/protobuf/t1$c;

.field public static final enum MESSAGE:Lcom/google/protobuf/t1$c;

.field public static final enum STRING:Lcom/google/protobuf/t1$c;


# instance fields
.field private final defaultDefault:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/protobuf/t1$c;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "INT"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->INT:Lcom/google/protobuf/t1$c;

    new-instance v0, Lcom/google/protobuf/t1$c;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "LONG"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->LONG:Lcom/google/protobuf/t1$c;

    new-instance v0, Lcom/google/protobuf/t1$c;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "FLOAT"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->FLOAT:Lcom/google/protobuf/t1$c;

    new-instance v0, Lcom/google/protobuf/t1$c;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "DOUBLE"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->DOUBLE:Lcom/google/protobuf/t1$c;

    new-instance v0, Lcom/google/protobuf/t1$c;

    const/4 v1, 0x4

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v3, "BOOLEAN"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->BOOLEAN:Lcom/google/protobuf/t1$c;

    new-instance v0, Lcom/google/protobuf/t1$c;

    const/4 v1, 0x5

    const-string v2, ""

    const-string v3, "STRING"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->STRING:Lcom/google/protobuf/t1$c;

    new-instance v0, Lcom/google/protobuf/t1$c;

    const/4 v1, 0x6

    sget-object v2, Lcom/google/protobuf/g;->b:Lcom/google/protobuf/g;

    const-string v3, "BYTE_STRING"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->BYTE_STRING:Lcom/google/protobuf/t1$c;

    new-instance v0, Lcom/google/protobuf/t1$c;

    const-string v1, "ENUM"

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->ENUM:Lcom/google/protobuf/t1$c;

    new-instance v0, Lcom/google/protobuf/t1$c;

    const-string v1, "MESSAGE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/t1$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lcom/google/protobuf/t1$c;->MESSAGE:Lcom/google/protobuf/t1$c;

    invoke-static {}, Lcom/google/protobuf/t1$c;->b()[Lcom/google/protobuf/t1$c;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/t1$c;->$VALUES:[Lcom/google/protobuf/t1$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/protobuf/t1$c;->defaultDefault:Ljava/lang/Object;

    return-void
.end method

.method private static synthetic b()[Lcom/google/protobuf/t1$c;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Lcom/google/protobuf/t1$c;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/protobuf/t1$c;->INT:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/protobuf/t1$c;->LONG:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/google/protobuf/t1$c;->FLOAT:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/google/protobuf/t1$c;->DOUBLE:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/google/protobuf/t1$c;->BOOLEAN:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/google/protobuf/t1$c;->STRING:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/google/protobuf/t1$c;->BYTE_STRING:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/google/protobuf/t1$c;->ENUM:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/google/protobuf/t1$c;->MESSAGE:Lcom/google/protobuf/t1$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/t1$c;
    .locals 1

    const-class v0, Lcom/google/protobuf/t1$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/t1$c;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/t1$c;
    .locals 1

    sget-object v0, Lcom/google/protobuf/t1$c;->$VALUES:[Lcom/google/protobuf/t1$c;

    invoke-virtual {v0}, [Lcom/google/protobuf/t1$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/t1$c;

    return-object v0
.end method
