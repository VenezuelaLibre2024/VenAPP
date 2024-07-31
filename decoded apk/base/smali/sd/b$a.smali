.class Lsd/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd/b;->G(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lvd/c;

.field final synthetic c:Lsd/b;


# direct methods
.method constructor <init>(Lsd/b;Landroid/app/Activity;Lvd/c;)V
    .locals 0

    iput-object p1, p0, Lsd/b$a;->c:Lsd/b;

    iput-object p2, p0, Lsd/b$a;->a:Landroid/app/Activity;

    iput-object p3, p0, Lsd/b$a;->b:Lvd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lsd/b$a;->c:Lsd/b;

    iget-object v1, p0, Lsd/b$a;->a:Landroid/app/Activity;

    iget-object v2, p0, Lsd/b$a;->b:Lvd/c;

    invoke-static {v0, v1, v2}, Lsd/b;->b(Lsd/b;Landroid/app/Activity;Lvd/c;)V

    return-void
.end method
