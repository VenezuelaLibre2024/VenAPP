.class public final synthetic Lom/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;


# instance fields
.field public final synthetic a:Lom/o;


# direct methods
.method public synthetic constructor <init>(Lom/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/h;->a:Lom/o;

    return-void
.end method


# virtual methods
.method public final onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 1

    iget-object v0, p0, Lom/h;->a:Lom/o;

    invoke-static {v0, p1, p2}, Lom/i;->n(Lom/o;Landroid/media/MediaPlayer;I)V

    return-void
.end method
