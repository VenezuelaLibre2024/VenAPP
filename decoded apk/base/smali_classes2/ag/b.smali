.class final Lag/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/media/Image;


# direct methods
.method constructor <init>(Landroid/media/Image;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lag/b;->a:Landroid/media/Image;

    return-void
.end method


# virtual methods
.method final a()Landroid/media/Image;
    .locals 1

    iget-object v0, p0, Lag/b;->a:Landroid/media/Image;

    return-object v0
.end method

.method final b()[Landroid/media/Image$Plane;
    .locals 1

    iget-object v0, p0, Lag/b;->a:Landroid/media/Image;

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v0

    return-object v0
.end method
