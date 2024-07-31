.class public final enum Lcom/google/protobuf/b1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/b1;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/b1;

.field public static final enum PROTO2:Lcom/google/protobuf/b1;

.field public static final enum PROTO3:Lcom/google/protobuf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/protobuf/b1;

    const-string v1, "PROTO2"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/b1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/b1;->PROTO2:Lcom/google/protobuf/b1;

    new-instance v0, Lcom/google/protobuf/b1;

    const-string v1, "PROTO3"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/b1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/b1;->PROTO3:Lcom/google/protobuf/b1;

    invoke-static {}, Lcom/google/protobuf/b1;->b()[Lcom/google/protobuf/b1;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/b1;->$VALUES:[Lcom/google/protobuf/b1;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic b()[Lcom/google/protobuf/b1;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/protobuf/b1;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/protobuf/b1;->PROTO2:Lcom/google/protobuf/b1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/protobuf/b1;->PROTO3:Lcom/google/protobuf/b1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/b1;
    .locals 1

    const-class v0, Lcom/google/protobuf/b1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/b1;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/b1;
    .locals 1

    sget-object v0, Lcom/google/protobuf/b1;->$VALUES:[Lcom/google/protobuf/b1;

    invoke-virtual {v0}, [Lcom/google/protobuf/b1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/b1;

    return-object v0
.end method
