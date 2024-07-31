.class public final Lmd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmd/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lmd/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lmd/d$a;->DEFAULT:Lmd/d$a;

    iput-object v0, p0, Lmd/a;->b:Lmd/d$a;

    return-void
.end method

.method public static b()Lmd/a;
    .locals 1

    new-instance v0, Lmd/a;

    invoke-direct {v0}, Lmd/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lmd/d;
    .locals 3

    new-instance v0, Lmd/a$a;

    iget v1, p0, Lmd/a;->a:I

    iget-object v2, p0, Lmd/a;->b:Lmd/d$a;

    invoke-direct {v0, v1, v2}, Lmd/a$a;-><init>(ILmd/d$a;)V

    return-object v0
.end method

.method public c(I)Lmd/a;
    .locals 0

    iput p1, p0, Lmd/a;->a:I

    return-object p0
.end method
