.class abstract Ly/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/h;
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

.method static c(Lg0/c0;I)Ly/h$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/c0<",
            "Landroid/graphics/Bitmap;",
            ">;I)",
            "Ly/h$a;"
        }
    .end annotation

    new-instance v0, Ly/a;

    invoke-direct {v0, p0, p1}, Ly/a;-><init>(Lg0/c0;I)V

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
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end method