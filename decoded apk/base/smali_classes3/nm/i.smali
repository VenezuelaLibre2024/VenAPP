.class public final synthetic Lnm/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lom/o;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lom/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm/i;->a:Lom/o;

    iput-object p2, p0, Lnm/i;->b:Ljava/lang/String;

    iput-object p3, p0, Lnm/i;->c:Ljava/lang/String;

    iput-object p4, p0, Lnm/i;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnm/i;->a:Lom/o;

    iget-object v1, p0, Lnm/i;->b:Ljava/lang/String;

    iget-object v2, p0, Lnm/i;->c:Ljava/lang/String;

    iget-object v3, p0, Lnm/i;->d:Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lnm/m;->g(Lom/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
