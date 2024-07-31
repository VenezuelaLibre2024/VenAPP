.class Lwi/i$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwi/i$c;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwi/i$c;


# direct methods
.method constructor <init>(Lwi/i$c;)V
    .locals 0

    iput-object p1, p0, Lwi/i$c$a;->a:Lwi/i$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public m()Ldm/y;
    .locals 1

    sget-object v0, Ldm/y;->e:Ldm/y;

    return-object v0
.end method

.method public s1(Ldm/b;J)J
    .locals 0

    const-wide/16 p1, -0x1

    return-wide p1
.end method
