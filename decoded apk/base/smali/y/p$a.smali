.class abstract Ly/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/p;
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

.method static c(Lg0/c0;I)Ly/p$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/c0<",
            "Landroidx/camera/core/o;",
            ">;I)",
            "Ly/p$a;"
        }
    .end annotation

    new-instance v0, Ly/d;

    invoke-direct {v0, p0, p1}, Ly/d;-><init>(Lg0/c0;I)V

    return-object v0
.end method


# virtual methods
.method abstract a()I
.end method

.method abstract b()Lg0/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg0/c0<",
            "Landroidx/camera/core/o;",
            ">;"
        }
    .end annotation
.end method
