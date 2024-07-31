.class public final Lwh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwh/a;

    invoke-direct {v0}, Lwh/a;-><init>()V

    sput-object v0, Lwh/a;->a:Lwh/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lvh/a;->a:Lvh/a;

    invoke-virtual {v0, p1}, Lvh/a;->a(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
