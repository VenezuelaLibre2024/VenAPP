.class public Lzd/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lbk/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbk/a<",
            "Lzd/l0;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lzb/g;

.field private final c:Landroid/app/Application;

.field private final d:Lce/a;

.field private final e:Lzd/v2;


# direct methods
.method public constructor <init>(Lbk/a;Lzb/g;Landroid/app/Application;Lce/a;Lzd/v2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk/a<",
            "Lzd/l0;",
            ">;",
            "Lzb/g;",
            "Landroid/app/Application;",
            "Lce/a;",
            "Lzd/v2;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/d;->a:Lbk/a;

    iput-object p2, p0, Lzd/d;->b:Lzb/g;

    iput-object p3, p0, Lzd/d;->c:Landroid/app/Application;

    iput-object p4, p0, Lzd/d;->d:Lce/a;

    iput-object p5, p0, Lzd/d;->e:Lzd/v2;

    return-void
.end method

.method private a(Lzd/k2;)Lpf/c;
    .locals 2

    invoke-static {}, Lpf/c;->f0()Lpf/c$b;

    move-result-object v0

    iget-object v1, p0, Lzd/d;->b:Lzb/g;

    invoke-virtual {v1}, Lzb/g;->r()Lzb/p;

    move-result-object v1

    invoke-virtual {v1}, Lzb/p;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpf/c$b;->K(Ljava/lang/String;)Lpf/c$b;

    move-result-object v0

    invoke-virtual {p1}, Lzd/k2;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpf/c$b;->I(Ljava/lang/String;)Lpf/c$b;

    move-result-object v0

    invoke-virtual {p1}, Lzd/k2;->c()Lcom/google/firebase/installations/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/installations/g;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpf/c$b;->J(Ljava/lang/String;)Lpf/c$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lpf/c;

    return-object p1
.end method

.method private b()Lyb/b;
    .locals 3

    invoke-static {}, Lyb/b;->g0()Lyb/b$a;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyb/b$a;->K(Ljava/lang/String;)Lyb/b$a;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyb/b$a;->J(Ljava/lang/String;)Lyb/b$a;

    move-result-object v0

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyb/b$a;->L(Ljava/lang/String;)Lyb/b$a;

    move-result-object v0

    invoke-direct {p0}, Lzd/d;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lyb/b$a;->I(Ljava/lang/String;)Lyb/b$a;

    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object v0

    check-cast v0, Lyb/b;

    return-object v0
.end method

.method private d()Ljava/lang/String;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lzd/d;->c:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lzd/d;->c:Landroid/app/Application;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error finding versionName : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzd/l2;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method private e(Lpf/e;)Lpf/e;
    .locals 9

    invoke-virtual {p1}, Lpf/e;->e0()J

    move-result-wide v0

    iget-object v2, p0, Lzd/d;->d:Lce/a;

    invoke-interface {v2}, Lce/a;->a()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    add-long/2addr v2, v7

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Lpf/e;->e0()J

    move-result-wide v0

    iget-object v2, p0, Lzd/d;->d:Lce/a;

    invoke-interface {v2}, Lce/a;->a()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x3

    invoke-virtual {v4, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    add-long/2addr v2, v7

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/x;->Y()Lcom/google/protobuf/x$a;

    move-result-object p1

    check-cast p1, Lpf/e$b;

    iget-object v0, p0, Lzd/d;->d:Lce/a;

    invoke-interface {v0}, Lce/a;->a()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lpf/e$b;->I(J)Lpf/e$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lpf/e;

    return-object p1
.end method


# virtual methods
.method c(Lzd/k2;Lpf/b;)Lpf/e;
    .locals 3

    const-string v0, "Fetching campaigns from service."

    invoke-static {v0}, Lzd/l2;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lzd/d;->e:Lzd/v2;

    invoke-virtual {v0}, Lzd/v2;->a()V

    iget-object v0, p0, Lzd/d;->a:Lbk/a;

    invoke-interface {v0}, Lbk/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzd/l0;

    invoke-static {}, Lpf/d;->j0()Lpf/d$b;

    move-result-object v1

    iget-object v2, p0, Lzd/d;->b:Lzb/g;

    invoke-virtual {v2}, Lzb/g;->r()Lzb/p;

    move-result-object v2

    invoke-virtual {v2}, Lzb/p;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpf/d$b;->K(Ljava/lang/String;)Lpf/d$b;

    move-result-object v1

    invoke-virtual {p2}, Lpf/b;->f0()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Lpf/d$b;->I(Ljava/lang/Iterable;)Lpf/d$b;

    move-result-object p2

    invoke-direct {p0}, Lzd/d;->b()Lyb/b;

    move-result-object v1

    invoke-virtual {p2, v1}, Lpf/d$b;->J(Lyb/b;)Lpf/d$b;

    move-result-object p2

    invoke-direct {p0, p1}, Lzd/d;->a(Lzd/k2;)Lpf/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lpf/d$b;->L(Lpf/c;)Lpf/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lpf/d;

    invoke-virtual {v0, p1}, Lzd/l0;->a(Lpf/d;)Lpf/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lzd/d;->e(Lpf/e;)Lpf/e;

    move-result-object p1

    return-object p1
.end method
