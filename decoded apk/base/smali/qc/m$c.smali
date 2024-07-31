.class final enum Lqc/m$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqc/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqc/m$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqc/m$c;

.field public static final enum IDLE:Lqc/m$c;

.field public static final enum QUEUED:Lqc/m$c;

.field public static final enum QUEUING:Lqc/m$c;

.field public static final enum RUNNING:Lqc/m$c;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lqc/m$c;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqc/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqc/m$c;->IDLE:Lqc/m$c;

    new-instance v1, Lqc/m$c;

    const-string v3, "QUEUING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lqc/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lqc/m$c;->QUEUING:Lqc/m$c;

    new-instance v3, Lqc/m$c;

    const-string v5, "QUEUED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lqc/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lqc/m$c;->QUEUED:Lqc/m$c;

    new-instance v5, Lqc/m$c;

    const-string v7, "RUNNING"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lqc/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lqc/m$c;->RUNNING:Lqc/m$c;

    const/4 v7, 0x4

    new-array v7, v7, [Lqc/m$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lqc/m$c;->$VALUES:[Lqc/m$c;

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

.method public static valueOf(Ljava/lang/String;)Lqc/m$c;
    .locals 1

    const-class v0, Lqc/m$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqc/m$c;

    return-object p0
.end method

.method public static values()[Lqc/m$c;
    .locals 1

    sget-object v0, Lqc/m$c;->$VALUES:[Lqc/m$c;

    invoke-virtual {v0}, [Lqc/m$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqc/m$c;

    return-object v0
.end method
