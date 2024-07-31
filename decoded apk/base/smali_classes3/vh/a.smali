.class public final Lvh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvh/a;

    invoke-direct {v0}, Lvh/a;-><init>()V

    sput-object v0, Lvh/a;->a:Lvh/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Luh/a;->a:Luh/a;

    invoke-virtual {p1}, Luh/a;->a()V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
