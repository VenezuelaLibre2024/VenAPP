.class public final Lql/d0$a$a;
.super Lql/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lql/d0$a;->a(Ldm/d;Lql/w;J)Lql/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lql/w;

.field final synthetic c:J

.field final synthetic d:Ldm/d;


# direct methods
.method constructor <init>(Lql/w;JLdm/d;)V
    .locals 0

    iput-object p1, p0, Lql/d0$a$a;->b:Lql/w;

    iput-wide p2, p0, Lql/d0$a$a;->c:J

    iput-object p4, p0, Lql/d0$a$a;->d:Ldm/d;

    invoke-direct {p0}, Lql/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-wide v0, p0, Lql/d0$a$a;->c:J

    return-wide v0
.end method

.method public e()Lql/w;
    .locals 1

    iget-object v0, p0, Lql/d0$a$a;->b:Lql/w;

    return-object v0
.end method

.method public f()Ldm/d;
    .locals 1

    iget-object v0, p0, Lql/d0$a$a;->d:Ldm/d;

    return-object v0
.end method
