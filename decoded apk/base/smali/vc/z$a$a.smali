.class Lvc/z$a$a;
.super Lvc/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/z$a;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lvc/z$a;


# direct methods
.method constructor <init>(Lvc/z$a;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lvc/z$a$a;->b:Lvc/z$a;

    iput-object p2, p0, Lvc/z$a$a;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Lvc/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lvc/z$a$a;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
