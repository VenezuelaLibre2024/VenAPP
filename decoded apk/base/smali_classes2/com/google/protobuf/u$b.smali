.class final enum Lcom/google/protobuf/u$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/u$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/u$b;

.field public static final enum MAP:Lcom/google/protobuf/u$b;

.field public static final enum PACKED_VECTOR:Lcom/google/protobuf/u$b;

.field public static final enum SCALAR:Lcom/google/protobuf/u$b;

.field public static final enum VECTOR:Lcom/google/protobuf/u$b;


# instance fields
.field private final isList:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/protobuf/u$b;

    const-string v1, "SCALAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/u$b;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/google/protobuf/u$b;->SCALAR:Lcom/google/protobuf/u$b;

    new-instance v0, Lcom/google/protobuf/u$b;

    const-string v1, "VECTOR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/google/protobuf/u$b;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/google/protobuf/u$b;->VECTOR:Lcom/google/protobuf/u$b;

    new-instance v0, Lcom/google/protobuf/u$b;

    const-string v1, "PACKED_VECTOR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v3}, Lcom/google/protobuf/u$b;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/google/protobuf/u$b;->PACKED_VECTOR:Lcom/google/protobuf/u$b;

    new-instance v0, Lcom/google/protobuf/u$b;

    const-string v1, "MAP"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lcom/google/protobuf/u$b;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/google/protobuf/u$b;->MAP:Lcom/google/protobuf/u$b;

    invoke-static {}, Lcom/google/protobuf/u$b;->b()[Lcom/google/protobuf/u$b;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/u$b;->$VALUES:[Lcom/google/protobuf/u$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lcom/google/protobuf/u$b;->isList:Z

    return-void
.end method

.method private static synthetic b()[Lcom/google/protobuf/u$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/google/protobuf/u$b;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/protobuf/u$b;->SCALAR:Lcom/google/protobuf/u$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/protobuf/u$b;->VECTOR:Lcom/google/protobuf/u$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/google/protobuf/u$b;->PACKED_VECTOR:Lcom/google/protobuf/u$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/google/protobuf/u$b;->MAP:Lcom/google/protobuf/u$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/u$b;
    .locals 1

    const-class v0, Lcom/google/protobuf/u$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/u$b;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/u$b;
    .locals 1

    sget-object v0, Lcom/google/protobuf/u$b;->$VALUES:[Lcom/google/protobuf/u$b;

    invoke-virtual {v0}, [Lcom/google/protobuf/u$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/u$b;

    return-object v0
.end method
