.class public final Luh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Luh/a;

.field private static final b:Lql/y;

.field private static final c:Lcom/google/gson/Gson;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Luh/a;

    invoke-direct {v0}, Luh/a;-><init>()V

    sput-object v0, Luh/a;->a:Luh/a;

    new-instance v0, Lql/y$a;

    invoke-direct {v0}, Lql/y$a;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v2, v3, v1}, Lql/y$a;->b(JLjava/util/concurrent/TimeUnit;)Lql/y$a;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lql/y$a;->K(JLjava/util/concurrent/TimeUnit;)Lql/y$a;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lql/y$a;->G(JLjava/util/concurrent/TimeUnit;)Lql/y$a;

    move-result-object v0

    invoke-virtual {v0}, Lql/y$a;->a()Lql/y;

    move-result-object v0

    sput-object v0, Luh/a;->b:Lql/y;

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    sput-object v0, Luh/a;->c:Lcom/google/gson/Gson;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method
