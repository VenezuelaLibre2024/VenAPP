.class public final enum Llm/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llm/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Llm/a;

.field public static final enum CANCELED:Llm/a;

.field public static final enum COMPLETE:Llm/a;

.field public static final enum ENQUEUED:Llm/a;

.field public static final enum FAILED:Llm/a;

.field public static final enum PAUSED:Llm/a;

.field public static final enum RUNNING:Llm/a;

.field public static final enum UNDEFINED:Llm/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llm/a;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llm/a;->UNDEFINED:Llm/a;

    new-instance v0, Llm/a;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llm/a;->ENQUEUED:Llm/a;

    new-instance v0, Llm/a;

    const-string v1, "RUNNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llm/a;->RUNNING:Llm/a;

    new-instance v0, Llm/a;

    const-string v1, "COMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llm/a;->COMPLETE:Llm/a;

    new-instance v0, Llm/a;

    const-string v1, "FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llm/a;->FAILED:Llm/a;

    new-instance v0, Llm/a;

    const-string v1, "CANCELED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llm/a;->CANCELED:Llm/a;

    new-instance v0, Llm/a;

    const-string v1, "PAUSED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Llm/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llm/a;->PAUSED:Llm/a;

    invoke-static {}, Llm/a;->b()[Llm/a;

    move-result-object v0

    sput-object v0, Llm/a;->$VALUES:[Llm/a;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Llm/a;->$ENTRIES:Lik/a;

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

.method private static final synthetic b()[Llm/a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Llm/a;

    const/4 v1, 0x0

    sget-object v2, Llm/a;->UNDEFINED:Llm/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Llm/a;->ENQUEUED:Llm/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Llm/a;->RUNNING:Llm/a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Llm/a;->COMPLETE:Llm/a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Llm/a;->FAILED:Llm/a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Llm/a;->CANCELED:Llm/a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Llm/a;->PAUSED:Llm/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llm/a;
    .locals 1

    const-class v0, Llm/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llm/a;

    return-object p0
.end method

.method public static values()[Llm/a;
    .locals 1

    sget-object v0, Llm/a;->$VALUES:[Llm/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llm/a;

    return-object v0
.end method
