.class public final synthetic Lom/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field public final synthetic a:Lom/o;


# direct methods
.method public synthetic constructor <init>(Lom/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/d;->a:Lom/o;

    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    iget-object v0, p0, Lom/d;->a:Lom/o;

    invoke-static {v0, p1}, Lom/i;->m(Lom/o;Landroid/media/MediaPlayer;)V

    return-void
.end method
