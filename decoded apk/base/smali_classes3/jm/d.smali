.class public final synthetic Ljm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/SoundPool$OnLoadCompleteListener;


# instance fields
.field public final synthetic a:Ljm/g;


# direct methods
.method public synthetic constructor <init>(Ljm/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljm/d;->a:Ljm/g;

    return-void
.end method


# virtual methods
.method public final onLoadComplete(Landroid/media/SoundPool;II)V
    .locals 1

    iget-object v0, p0, Ljm/d;->a:Ljm/g;

    invoke-static {v0, p1, p2, p3}, Ljm/g;->b(Ljm/g;Landroid/media/SoundPool;II)V

    return-void
.end method
