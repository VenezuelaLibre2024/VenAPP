.class public final enum Lcom/google/firebase/perf/util/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/firebase/perf/util/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/firebase/perf/util/c;

.field public static final enum APP_START_TRACE_NAME:Lcom/google/firebase/perf/util/c;

.field public static final enum BACKGROUND_TRACE_NAME:Lcom/google/firebase/perf/util/c;

.field public static final enum FOREGROUND_TRACE_NAME:Lcom/google/firebase/perf/util/c;

.field public static final enum ON_CREATE_TRACE_NAME:Lcom/google/firebase/perf/util/c;

.field public static final enum ON_RESUME_TRACE_NAME:Lcom/google/firebase/perf/util/c;

.field public static final enum ON_START_TRACE_NAME:Lcom/google/firebase/perf/util/c;


# instance fields
.field private mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/google/firebase/perf/util/c;

    const-string v1, "_as"

    const-string v2, "APP_START_TRACE_NAME"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/google/firebase/perf/util/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/firebase/perf/util/c;->APP_START_TRACE_NAME:Lcom/google/firebase/perf/util/c;

    new-instance v1, Lcom/google/firebase/perf/util/c;

    const-string v2, "_astui"

    const-string v4, "ON_CREATE_TRACE_NAME"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/google/firebase/perf/util/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/firebase/perf/util/c;->ON_CREATE_TRACE_NAME:Lcom/google/firebase/perf/util/c;

    new-instance v2, Lcom/google/firebase/perf/util/c;

    const-string v4, "_astfd"

    const-string v6, "ON_START_TRACE_NAME"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lcom/google/firebase/perf/util/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/google/firebase/perf/util/c;->ON_START_TRACE_NAME:Lcom/google/firebase/perf/util/c;

    new-instance v4, Lcom/google/firebase/perf/util/c;

    const-string v6, "_asti"

    const-string v8, "ON_RESUME_TRACE_NAME"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lcom/google/firebase/perf/util/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/google/firebase/perf/util/c;->ON_RESUME_TRACE_NAME:Lcom/google/firebase/perf/util/c;

    new-instance v6, Lcom/google/firebase/perf/util/c;

    const-string v8, "_fs"

    const-string v10, "FOREGROUND_TRACE_NAME"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lcom/google/firebase/perf/util/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/google/firebase/perf/util/c;->FOREGROUND_TRACE_NAME:Lcom/google/firebase/perf/util/c;

    new-instance v8, Lcom/google/firebase/perf/util/c;

    const-string v10, "_bs"

    const-string v12, "BACKGROUND_TRACE_NAME"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lcom/google/firebase/perf/util/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/google/firebase/perf/util/c;->BACKGROUND_TRACE_NAME:Lcom/google/firebase/perf/util/c;

    const/4 v10, 0x6

    new-array v10, v10, [Lcom/google/firebase/perf/util/c;

    aput-object v0, v10, v3

    aput-object v1, v10, v5

    aput-object v2, v10, v7

    aput-object v4, v10, v9

    aput-object v6, v10, v11

    aput-object v8, v10, v13

    sput-object v10, Lcom/google/firebase/perf/util/c;->$VALUES:[Lcom/google/firebase/perf/util/c;

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

    iput-object p3, p0, Lcom/google/firebase/perf/util/c;->mName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/firebase/perf/util/c;
    .locals 1

    const-class v0, Lcom/google/firebase/perf/util/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/perf/util/c;

    return-object p0
.end method

.method public static values()[Lcom/google/firebase/perf/util/c;
    .locals 1

    sget-object v0, Lcom/google/firebase/perf/util/c;->$VALUES:[Lcom/google/firebase/perf/util/c;

    invoke-virtual {v0}, [Lcom/google/firebase/perf/util/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/perf/util/c;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/util/c;->mName:Ljava/lang/String;

    return-object v0
.end method
