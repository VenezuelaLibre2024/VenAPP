.class Lg2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/a;->a(Lk2/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk2/u;

.field final synthetic b:Lg2/a;


# direct methods
.method constructor <init>(Lg2/a;Lk2/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lg2/a$a;->b:Lg2/a;

    iput-object p2, p0, Lg2/a$a;->a:Lk2/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v1, Lg2/a;->d:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Scheduling work "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lg2/a$a;->a:Lk2/u;

    iget-object v3, v3, Lk2/u;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lg2/a$a;->b:Lg2/a;

    iget-object v0, v0, Lg2/a;->a:Lg2/b;

    const/4 v1, 0x1

    new-array v1, v1, [Lk2/u;

    const/4 v2, 0x0

    iget-object v3, p0, Lg2/a$a;->a:Lk2/u;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lg2/b;->a([Lk2/u;)V

    return-void
.end method
