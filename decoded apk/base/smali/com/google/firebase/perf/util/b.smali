.class public final enum Lcom/google/firebase/perf/util/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/firebase/perf/util/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/firebase/perf/util/b;

.field public static final enum FRAMES_FROZEN:Lcom/google/firebase/perf/util/b;

.field public static final enum FRAMES_SLOW:Lcom/google/firebase/perf/util/b;

.field public static final enum FRAMES_TOTAL:Lcom/google/firebase/perf/util/b;

.field public static final enum NETWORK_TRACE_EVENT_RATE_LIMITED:Lcom/google/firebase/perf/util/b;

.field public static final enum TRACE_EVENT_RATE_LIMITED:Lcom/google/firebase/perf/util/b;

.field public static final enum TRACE_STARTED_NOT_STOPPED:Lcom/google/firebase/perf/util/b;


# instance fields
.field private mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/google/firebase/perf/util/b;

    const-string v1, "_fstec"

    const-string v2, "TRACE_EVENT_RATE_LIMITED"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/firebase/perf/util/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/firebase/perf/util/b;->TRACE_EVENT_RATE_LIMITED:Lcom/google/firebase/perf/util/b;

    new-instance v1, Lcom/google/firebase/perf/util/b;

    const-string v2, "_fsntc"

    const-string v4, "NETWORK_TRACE_EVENT_RATE_LIMITED"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/google/firebase/perf/util/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/firebase/perf/util/b;->NETWORK_TRACE_EVENT_RATE_LIMITED:Lcom/google/firebase/perf/util/b;

    new-instance v2, Lcom/google/firebase/perf/util/b;

    const-string v4, "_tsns"

    const-string v6, "TRACE_STARTED_NOT_STOPPED"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lcom/google/firebase/perf/util/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/google/firebase/perf/util/b;->TRACE_STARTED_NOT_STOPPED:Lcom/google/firebase/perf/util/b;

    new-instance v4, Lcom/google/firebase/perf/util/b;

    const-string v6, "_fr_tot"

    const-string v8, "FRAMES_TOTAL"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lcom/google/firebase/perf/util/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/google/firebase/perf/util/b;->FRAMES_TOTAL:Lcom/google/firebase/perf/util/b;

    new-instance v6, Lcom/google/firebase/perf/util/b;

    const-string v8, "_fr_slo"

    const-string v10, "FRAMES_SLOW"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lcom/google/firebase/perf/util/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/google/firebase/perf/util/b;->FRAMES_SLOW:Lcom/google/firebase/perf/util/b;

    new-instance v8, Lcom/google/firebase/perf/util/b;

    const-string v10, "_fr_fzn"

    const-string v12, "FRAMES_FROZEN"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lcom/google/firebase/perf/util/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/google/firebase/perf/util/b;->FRAMES_FROZEN:Lcom/google/firebase/perf/util/b;

    const/4 v10, 0x6

    new-array v10, v10, [Lcom/google/firebase/perf/util/b;

    aput-object v0, v10, v3

    aput-object v1, v10, v5

    aput-object v2, v10, v7

    aput-object v4, v10, v9

    aput-object v6, v10, v11

    aput-object v8, v10, v13

    sput-object v10, Lcom/google/firebase/perf/util/b;->$VALUES:[Lcom/google/firebase/perf/util/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/firebase/perf/util/b;->mName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/firebase/perf/util/b;
    .locals 1

    const-class v0, Lcom/google/firebase/perf/util/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/perf/util/b;

    return-object p0
.end method

.method public static values()[Lcom/google/firebase/perf/util/b;
    .locals 1

    sget-object v0, Lcom/google/firebase/perf/util/b;->$VALUES:[Lcom/google/firebase/perf/util/b;

    invoke-virtual {v0}, [Lcom/google/firebase/perf/util/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/perf/util/b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/util/b;->mName:Ljava/lang/String;

    return-object v0
.end method
