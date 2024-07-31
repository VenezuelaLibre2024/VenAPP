.class public final synthetic Lom/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field public final synthetic a:Lom/o;


# direct methods
.method public synthetic constructor <init>(Lom/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/g;->a:Lom/o;

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 1

    iget-object v0, p0, Lom/g;->a:Lom/o;

    invoke-static {v0, p1, p2, p3}, Lom/i;->b(Lom/o;Landroid/media/MediaPlayer;II)Z

    move-result p1

    return p1
.end method
