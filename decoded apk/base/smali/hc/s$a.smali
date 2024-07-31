.class Lhc/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhc/s;-><init>(Landroid/content/Context;Lhc/m;Lic/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhc/m;

.field final synthetic b:Lic/a;

.field final synthetic c:Lhc/s;


# direct methods
.method constructor <init>(Lhc/s;Lhc/m;Lic/a;)V
    .locals 0

    iput-object p1, p0, Lhc/s$a;->c:Lhc/s;

    iput-object p2, p0, Lhc/s$a;->a:Lhc/m;

    iput-object p3, p0, Lhc/s$a;->b:Lic/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    iget-object v0, p0, Lhc/s$a;->c:Lhc/s;

    invoke-static {v0, p1}, Lhc/s;->a(Lhc/s;Z)Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhc/s$a;->a:Lhc/m;

    invoke-virtual {p1}, Lhc/m;->c()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lhc/s$a;->c:Lhc/s;

    invoke-static {p1}, Lhc/s;->b(Lhc/s;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lhc/s$a;->a:Lhc/m;

    iget-object v0, p0, Lhc/s$a;->c:Lhc/s;

    invoke-static {v0}, Lhc/s;->c(Lhc/s;)J

    move-result-wide v0

    iget-object v2, p0, Lhc/s$a;->b:Lic/a;

    invoke-interface {v2}, Lic/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lhc/m;->g(J)V

    :cond_1
    :goto_0
    return-void
.end method
