.class public final Lrj/d;
.super Ldj/o;
.source "SourceFile"

# interfaces
.implements Lmj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldj/o<",
        "Ljava/lang/Object;",
        ">;",
        "Lmj/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ldj/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/o<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrj/d;

    invoke-direct {v0}, Lrj/d;-><init>()V

    sput-object v0, Lrj/d;->a:Ldj/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldj/o;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected s(Ldj/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lkj/c;->m(Ldj/q;)V

    return-void
.end method
