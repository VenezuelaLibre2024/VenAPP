.class public Lbe/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lde/m;
    .locals 4

    invoke-static {}, Lde/m;->a()Lde/m$a;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lde/m$a;->b(J)Lde/m$a;

    move-result-object v0

    const-string v3, "APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY"

    invoke-virtual {v0, v3}, Lde/m$a;->c(Ljava/lang/String;)Lde/m$a;

    move-result-object v0

    sget-object v3, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lde/m$a;->d(J)Lde/m$a;

    move-result-object v0

    invoke-virtual {v0}, Lde/m$a;->a()Lde/m;

    move-result-object v0

    return-object v0
.end method
