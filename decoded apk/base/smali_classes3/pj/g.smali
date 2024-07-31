.class public final Lpj/g;
.super Ldj/f;
.source "SourceFile"

# interfaces
.implements Lmj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldj/f<",
        "Ljava/lang/Object;",
        ">;",
        "Lmj/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Ldj/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/f<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpj/g;

    invoke-direct {v0}, Lpj/g;-><init>()V

    sput-object v0, Lpj/g;->b:Ldj/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ldj/f;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Lim/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lwj/d;->b(Lim/b;)V

    return-void
.end method

.method public call()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
