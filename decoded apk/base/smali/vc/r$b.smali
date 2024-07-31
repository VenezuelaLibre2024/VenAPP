.class Lvc/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/r;->k(Lcd/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcd/i;

.field final synthetic b:Lvc/r;


# direct methods
.method constructor <init>(Lvc/r;Lcd/i;)V
    .locals 0

    iput-object p1, p0, Lvc/r$b;->b:Lvc/r;

    iput-object p2, p0, Lvc/r$b;->a:Lcd/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lvc/r$b;->b:Lvc/r;

    iget-object v1, p0, Lvc/r$b;->a:Lcd/i;

    invoke-static {v0, v1}, Lvc/r;->a(Lvc/r;Lcd/i;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
