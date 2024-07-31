.class abstract Ly/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c(Lg0/c0;Landroidx/camera/core/n$g;)Ly/t$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/c0<",
            "[B>;",
            "Landroidx/camera/core/n$g;",
            ")",
            "Ly/t$a;"
        }
    .end annotation

    new-instance v0, Ly/e;

    invoke-direct {v0, p0, p1}, Ly/e;-><init>(Lg0/c0;Landroidx/camera/core/n$g;)V

    return-object v0
.end method


# virtual methods
.method abstract a()Landroidx/camera/core/n$g;
.end method

.method abstract b()Lg0/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg0/c0<",
            "[B>;"
        }
    .end annotation
.end method
