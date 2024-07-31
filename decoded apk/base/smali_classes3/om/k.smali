.class public final synthetic Lom/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/SoundPool$OnLoadCompleteListener;


# instance fields
.field public final synthetic a:Lom/l;

.field public final synthetic b:Lom/n;


# direct methods
.method public synthetic constructor <init>(Lom/l;Lom/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/k;->a:Lom/l;

    iput-object p2, p0, Lom/k;->b:Lom/n;

    return-void
.end method


# virtual methods
.method public final onLoadComplete(Landroid/media/SoundPool;II)V
    .locals 2

    iget-object v0, p0, Lom/k;->a:Lom/l;

    iget-object v1, p0, Lom/k;->b:Lom/n;

    invoke-static {v0, v1, p1, p2, p3}, Lom/l;->a(Lom/l;Lom/n;Landroid/media/SoundPool;II)V

    return-void
.end method
