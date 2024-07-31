.class public final Lqj/d;
.super Ldj/j;
.source "SourceFile"

# interfaces
.implements Lmj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldj/j<",
        "Ljava/lang/Object;",
        ">;",
        "Lmj/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lqj/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqj/d;

    invoke-direct {v0}, Lqj/d;-><init>()V

    sput-object v0, Lqj/d;->a:Lqj/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldj/j;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected u(Ldj/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lkj/c;->i(Ldj/l;)V

    return-void
.end method
