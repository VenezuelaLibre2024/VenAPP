.class public final synthetic Lnm/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lom/o;

.field public final synthetic b:Lnm/m;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lom/o;Lnm/m;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm/k;->a:Lom/o;

    iput-object p2, p0, Lnm/k;->b:Lnm/m;

    iput-object p3, p0, Lnm/k;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnm/k;->a:Lom/o;

    iget-object v1, p0, Lnm/k;->b:Lnm/m;

    iget-object v2, p0, Lnm/k;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lnm/m;->b(Lom/o;Lnm/m;Ljava/lang/String;)V

    return-void
.end method
