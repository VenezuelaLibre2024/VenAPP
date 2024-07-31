.class public final Lxh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lxh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxh/a;

    invoke-direct {v0}, Lxh/a;-><init>()V

    sput-object v0, Lxh/a;->a:Lxh/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    :try_start_0
    new-instance v0, Lxh/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxh/a$a;-><init>(Lgk/Continuation;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, Lzk/h;->f(Lgk/f;Lok/p;ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/firebase/crashlytics/a;->g(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
