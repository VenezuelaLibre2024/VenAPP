.class abstract Ly/e0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c(Ly/f0;Landroidx/camera/core/o;)Ly/e0$b;
    .locals 1

    new-instance v0, Ly/g;

    invoke-direct {v0, p0, p1}, Ly/g;-><init>(Ly/f0;Landroidx/camera/core/o;)V

    return-object v0
.end method


# virtual methods
.method abstract a()Landroidx/camera/core/o;
.end method

.method abstract b()Ly/f0;
.end method
