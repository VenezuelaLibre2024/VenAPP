.class abstract Ly/o$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static e(II)Ly/o$c;
    .locals 3

    new-instance v0, Ly/c;

    new-instance v1, Lg0/v;

    invoke-direct {v1}, Lg0/v;-><init>()V

    new-instance v2, Lg0/v;

    invoke-direct {v2}, Lg0/v;-><init>()V

    invoke-direct {v0, v1, v2, p0, p1}, Ly/c;-><init>(Lg0/v;Lg0/v;II)V

    return-object v0
.end method


# virtual methods
.method abstract a()Lg0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg0/v<",
            "Landroidx/camera/core/o;",
            ">;"
        }
    .end annotation
.end method

.method abstract b()I
.end method

.method abstract c()I
.end method

.method abstract d()Lg0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg0/v<",
            "Ly/f0;",
            ">;"
        }
    .end annotation
.end method
