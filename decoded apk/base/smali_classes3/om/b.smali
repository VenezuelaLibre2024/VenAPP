.class public final synthetic Lom/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Lom/c;

.field public final synthetic b:Lok/a;


# direct methods
.method public synthetic constructor <init>(Lom/c;Lok/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/b;->a:Lom/c;

    iput-object p2, p0, Lom/b;->b:Lok/a;

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 2

    iget-object v0, p0, Lom/b;->a:Lom/c;

    iget-object v1, p0, Lom/b;->b:Lok/a;

    invoke-static {v0, v1, p1}, Lom/c;->b(Lom/c;Lok/a;I)V

    return-void
.end method
