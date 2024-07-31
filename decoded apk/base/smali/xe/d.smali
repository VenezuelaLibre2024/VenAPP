.class public final enum Lxe/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/z$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxe/d;",
        ">;",
        "Lcom/google/protobuf/z$c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lxe/d;

.field public static final enum APPLICATION_PROCESS_STATE_UNKNOWN:Lxe/d;

.field public static final APPLICATION_PROCESS_STATE_UNKNOWN_VALUE:I = 0x0

.field public static final enum BACKGROUND:Lxe/d;

.field public static final BACKGROUND_VALUE:I = 0x2

.field public static final enum FOREGROUND:Lxe/d;

.field public static final enum FOREGROUND_BACKGROUND:Lxe/d;

.field public static final FOREGROUND_BACKGROUND_VALUE:I = 0x3

.field public static final FOREGROUND_VALUE:I = 0x1

.field private static final internalValueMap:Lcom/google/protobuf/z$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$d<",
            "Lxe/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lxe/d;

    const-string v1, "APPLICATION_PROCESS_STATE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lxe/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lxe/d;->APPLICATION_PROCESS_STATE_UNKNOWN:Lxe/d;

    new-instance v1, Lxe/d;

    const-string v3, "FOREGROUND"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lxe/d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lxe/d;->FOREGROUND:Lxe/d;

    new-instance v3, Lxe/d;

    const-string v5, "BACKGROUND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lxe/d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lxe/d;->BACKGROUND:Lxe/d;

    new-instance v5, Lxe/d;

    const-string v7, "FOREGROUND_BACKGROUND"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lxe/d;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lxe/d;->FOREGROUND_BACKGROUND:Lxe/d;

    const/4 v7, 0x4

    new-array v7, v7, [Lxe/d;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lxe/d;->$VALUES:[Lxe/d;

    new-instance v0, Lxe/d$a;

    invoke-direct {v0}, Lxe/d$a;-><init>()V

    sput-object v0, Lxe/d;->internalValueMap:Lcom/google/protobuf/z$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lxe/d;->value:I

    return-void
.end method

.method public static b(I)Lxe/d;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lxe/d;->FOREGROUND_BACKGROUND:Lxe/d;

    return-object p0

    :cond_1
    sget-object p0, Lxe/d;->BACKGROUND:Lxe/d;

    return-object p0

    :cond_2
    sget-object p0, Lxe/d;->FOREGROUND:Lxe/d;

    return-object p0

    :cond_3
    sget-object p0, Lxe/d;->APPLICATION_PROCESS_STATE_UNKNOWN:Lxe/d;

    return-object p0
.end method

.method public static h()Lcom/google/protobuf/z$e;
    .locals 1

    sget-object v0, Lxe/d$b;->a:Lcom/google/protobuf/z$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxe/d;
    .locals 1

    const-class v0, Lxe/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxe/d;

    return-object p0
.end method

.method public static values()[Lxe/d;
    .locals 1

    sget-object v0, Lxe/d;->$VALUES:[Lxe/d;

    invoke-virtual {v0}, [Lxe/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxe/d;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lxe/d;->value:I

    return v0
.end method
